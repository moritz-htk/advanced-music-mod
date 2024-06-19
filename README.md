<p align="center">
    <img src="https://i.imgur.com/WjEdgVZ.png"  alt="Advanced Music Mod title"/>
</p>

[![CurseForge Downloads](https://cf.way2muchnoise.eu/short_539777_downloads.svg?badge_style=for_the_badge)](https://www.curseforge.com/minecraft/mc-mods/advanced-music-mod)
[![Modrinth Downloads](https://img.shields.io/modrinth/dt/azvN9Im1?style=for-the-badge&logo=modrinth)](https://modrinth.com/mod/advanced-music-mod)
[![Mod Version](https://img.shields.io/modrinth/v/azvN9Im1?style=for-the-badge)](https://github.com/moritz-htk/advanced-music-mod/releases)
![Version Availability](https://cf.way2muchnoise.eu/versions/539777.svg?badge_style=for_the_badge)
[![License](https://img.shields.io/badge/LICENSE-moritz__htk_Software_License_Agreement_(mSLA)-red?style=for-the-badge)](https://sites.google.com/view/moritz-htk/license)

The Advanced Music Mod was created by [moritz_htk](https://github.com/moritz-htk). It contains 14 new music discs with music by Lucas King and Kevin MacLeod.

Each of the newly added music is copyright free. You can find each disc in familiar overworld structures like villages, temples, and more.

## Latest versions
| Version | Latest Version | Mod Loader       | Support |
|---------|----------------|------------------|---------|
| 1.20.x  | 2.0.2+1.20.6   | Fabric, NeoForge | Active  |

Click [here](https://github.com/moritz-htk/advanced-music-mod/releases) to get to the release list!

## Supported languages
- English, German, Spanish

## Planned functions
- more music discs
- villager trades & profession

## Credits
- [Lucas King](https://soundcloud.com/lucas-king-piano-music) (Composer)
- [Kevin MacLeod](https://soundcloud.com/kevin-9-1) (Composer)

## Dependencies
- [Architectury API](https://github.com/architectury/architectury-api) (v12.1.3 and above)

## Maven
Advanced Music Mod is available via [Curse Maven](https://www.cursemaven.com/) for developers wishing to make use of my mod.

Update your `build.gradle` file to include the following:

### Fabric `build.gradle`
```
repositories {
    maven { url "https://cursemaven.com" }
}

dependencies {
    modImplementation "curse.maven:advanced-music-mod-539777:${advanced_music_mod_file}"
}
```

### NeoForge `build.gradle`
```
repositories {
    maven { url "https://cursemaven.com" }
}

dependencies {
    implementation fg.deobf("curse.maven:advanced-music-mod-539777:${advanced_music_mod_file}")
}
```

Add the following to your `gradle.properties` file:

### `gradle.properties`
```
advanced_music_mod_file=4997539
```

To get the File ID, go to the [download page of my mod](https://www.curseforge.com/minecraft/mc-mods/advanced-music-mod/files), click on the file you want to use and the file ID will be in the URL.

## Social Media
Website: [https://sites.google.com/view/moritz-htk](https://sites.google.com/view/moritz-htk)