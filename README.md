# Statues Mod

The Statues Mod allows you to create Statues with anyone's skin out of various blocks (e. g. grass, stone, iron blocks, ...) and also adds a fancy Showcase that you can use to show off and store a valuable item.

This repository is a fork of the [Statues Mod](https://github.com/asiekierka/Statues) for Minecraft 1.7.10 containing various improvements and optimizations.

Just like the original version, this fork requires [AsieLib](https://www.github.com/Doenerstyle/AsieLib) to be installed.

> [!WARNING]
> Versions before v0.5.0 (see the link above) of AsieLib are affected by the **serious [Bleeding Pipe](https://blog.mmpa.info/posts/bleeding-pipe) security vulnerability**.
> Make sure to update your AsieLib Version and/or install something like the [serializationisbad](https://github.com/dogboy21/serializationisbad) mod.

## Improvements of this fork

This fork aims to improve the Statues Mod 1.7.10 version and fix long-standing bugs. Some notable improvements are:

- Fixed the broken player skin downloads by switching to the [Minotar API](https://minotar.net) (thanks @TCLProject)
- Released some [unreleased changes](https://github.com/asiekierka/Statues/commits/master/?since=2014-07-09), including a **fixed crash** when opening Showcases, some refactors and Italian, Korean, and Russian localizations
- Made untranslatable parts of the **GUI translatable**
- Improved the German and Simplified Chinese localizations
- [My fork of AsieLib](https://www.github.com/Doenerstyle/AsieLib) also **fixes the bug** of Showcase lids never closing (asiekierka#15).

## Unfixed bugs from the original

These bugs occur in the original version, too:

- When shift-clicking the items into them, Statues accept any kind of armor type in all of its armor slots.
- NEI incorrectly lists a Statue and a second Showcase with just stone/wood textures.

## Development/Support/Maintenance

Apart from possibly fixing the bugs listed above as well as possible other bugs reported by players, I am not planning to further update this mod.

Of course, **you're free to open issues if you encounter bugs or incompatibilities/crashes and PRs are always welcome, including new/updated localization files!**
