package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //navigation
        setSupportActionBar(binding.toolbar)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        setupBottomNavMenu(navController)
        setupSideNavigationMenu(navController)
        setActionBar(navController)
    }


    private fun setupBottomNavMenu(navController: NavController) {
        binding.bottomNav?.let {
            // using ? because in landscape it won't exist
            NavigationUI.setupWithNavController(it, navController)
        }
    }

    private fun setupSideNavigationMenu(navController: NavController) {
        binding.bottomNav?.let {
            // using ? because in landscape it won't exist
            NavigationUI.setupWithNavController(it, navController)
        }
    }

    private fun setActionBar(navController: NavController) {
        // so that the hamburger changes to/from correctly
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerLayout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // could be a class variable/property
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        val navigated = NavigationUI.onNavDestinationSelected(item, navController)
        return navigated || super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
                Navigation.findNavController(this, R.id.nav_host_fragment), binding.drawerLayout) // so the hamburger/back work correctly
    }

    //function to show specific menu items
//    fun showMenuItems(view: View) {
//        val fragment = WrapFragment()
//        val args = Bundle()
//        when(view.id) {
//            R.id.wraps -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.wraps)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Barbecue Chicken, Grilled Chicken, Curry Chicken, Veggie")
//            }
//            R.id.plates -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.rubbish)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Barbecue Chicken, Grilled Chicken, Curry Chicken, Veggie")
//            }
//            R.id.salads -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.salads)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Barbecue Chicken, Grilled Chicken, Curry Chicken, Veggie")
//            }
//            R.id.dinner -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.dinner)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Jerk Chicken, Oxtail, Curry Goat, Fried Fish, Vegan")
//            }
//            R.id.specials -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.special)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Special 1, Special 2, Special 3, Special 4, Special 5")
//            }
//            R.id.sides -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.side)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Fried Plantains, Fried Dumplings, Festivals, Garden Salad, Soup")
//            }
//            R.id.bevs -> {
//                args.putInt(WrapFragment.ARG_IMAGE_ID,R.drawable.drink)
//                args.putString(WrapFragment.ARG_TEXT_ID, "Orange Lemonade, Strawberry Lemonade, Hibiscus Sorrel, Carrot Juice, Ginger Beer")
//            }
//
//        }//when
//        fragment.arguments = args
//        supportFragmentManager.beginTransaction().replace(R.id.content,fragment).commit()
//    }

}