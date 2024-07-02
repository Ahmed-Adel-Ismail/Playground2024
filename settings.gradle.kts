pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include("weather:ui")
include(":weather:home")
include(":weather:favorites")
include(":weather:app")
include(":weather:splash")
include(":weather:favorites:api")
include(":weather:home:api")
include(":weather:splash:api")
include(":weather:datasources")
