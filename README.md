## Introduction

**Dico** is a small, lightweight library designed for the
[Bukkit](https://dev.bukkit.org/) platform and its frameworks. It provides
compatibility for the `Bukkit.getOnlinePlayers()` method across
[Minecraft](https://www.minecraft.net/) versions both below and above `1.7.10`.

### The problem

In [Bukkit](https://dev.bukkit.org/) for [Minecraft](https://www.minecraft.net/)
`1.7.10` and higher, the method `Bukkit.getOnlinePlayers()` returns a
`Collection<Player>`. However, in versions prior to `1.7.10`, it returns a
`Player[]` array. This difference creates backward compatibility issues when
developing plugins for multiple Minecraft versions.

### The solution

**Dico** solves this issue by allowing developers to maintain full compatibility
with both newer and older versions of [Minecraft](https://www.minecraft.net/).
With **Dico**, you can choose whether `Bukkit.getOnlinePlayers()` returns a
`Collection<Player>` or a `Player[]`, depending on your preference and the
[Minecraft](https://www.minecraft.net/) version you're targeting.

### Key features:

- Provides seamless backward compatibility for `Bukkit.getOnlinePlayers()`
  across [Bukkit](https://dev.bukkit.org/) versions.
- Allows developers to specify the preferred return type: `Collection<Player`>
  or `Player[]`.
- Easy to integrate and lightweight, adding minimal overhead to existing
  projects.

## Installation

### Requirements

- **Java**: 8 or higher.

### Step by step

The simplest way to install the **Dico** library is by using
[JitPack](https://jitpack.io/) with [Gradle](https://gradle.org/). Follow these
steps to integrate it into your project:

1. Add JitPack Repository

For [Groovy](https://groovy-lang.org/) (if using `settings.gradle`), add the
following repository configuration:

```groovy
dependencyResolutionManagement {
  repositories {
    maven {
      url "https://jitpack.io"
      content {
        includeGroup "com.github.kvdpxne"
      }
    }
  }
}
```

For [Gradle](https://gradle.org/) [Kotlin](https://kotlinlang.org/) DSL,
modify your `settings.gradle.kts` file:

```kotlin
dependencyResolutionManagement {
  repositories {
    maven {
      url = uri("https://jitpack.io/")
      content {
        includeGroupAndSubgroups("com.github.kvdpxne")
      }
    }
  }
}
```

2. Add Dependencies

For [Groovy](https://groovy-lang.org/) (if using `build.gradle`), add the
dependencies for the core and API modules:

```groovy
dependencies {
  // Include all modules of Dico
  implementation 'com.github.kvdpxne.dico:core:VERSION'
}
```

For [Gradle](https://gradle.org/) [Kotlin](https://kotlinlang.org/) DSL,
modify your `build.gradle.kts` file:

```kotlin
dependencies {
  // Include all modules of Dico
  implementation("com.github.kvdpxne.dico:core:VERSION")
}
```

Make sure to replace `VERSION` with the latest release version of the library.

This approach ensures you have the **Dico** library installed in the simplest
way via [Gradle](https://gradle.org/) using [JitPack](https://jitpack.io/).

## Usage

Using the **Dico** library is extremely simple. If you need to retrieve a
collection of online players, instead of calling `Bukkit.getOnlinePlayers()`,
you can use the following methods provided by **Dico**:

- To get online players as a `Collection<Player>`, use:

```java
Dico.getLocalPlayers().asCollection();
```

- To get online players as a `Player[]` array, use:

```java
Dico.getLocalPlayers().asArray();
```

This allows you to easily switch between returning a `Collection<Player>` or
`Player[]`, depending on your needs.

## License

This project is licensed under the **MIT License**. This means you are free to
use, modify, and distribute the code in both private and commercial projects, as
long as you include the original license in any substantial portions of the
code.

For more details, please refer to the full license text in the
[LICENSE](https://github.com/kvdpxne/dico/blob/master/LICENSE) file.
