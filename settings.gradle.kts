rootProject.name = "PlotSquared"
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

include("Core", "Bukkit")

project(":Core").name = "plotsquared-core"
project(":Bukkit").name = "plotsquared-bukkit"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

