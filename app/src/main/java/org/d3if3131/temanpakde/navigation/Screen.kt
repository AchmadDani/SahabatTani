package org.d3if3131.temanpakde.navigation

sealed class Screen(val route: String) {
    data object Main: Screen("mainScreen")
    data object Home: Screen("homeScreen")
    data object About: Screen("aboutScreen")
}
