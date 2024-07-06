# Statues Mod

This repository is a fork of the [Statues Mod](https://github.com/asiekierka/Statues) for Minecraft 1.7.10 containing various improvements and optimizations.

Just like the original version, this fork requires [AsieLib](https://www.github.com/Doenerstyle/AsieLib) to be installed.

> [!WARNING]
> Versions before v0.5.0 (see the link above) of AsieLib are affected by the **serious [Bleeding Pipe](https://blog.mmpa.info/posts/bleeding-pipe) security vulnerability**.
> Make sure to update your AsieLib Version and/or install something like the [serializationisbad](https://github.com/dogboy21/serializationisbad) mod.

## Improvements of this fork

This fork aims to improve the Statues Mod 1.7.10 version and fix long-standing bugs. Some notable improvements are:

- Released some [unreleased changes](https://github.com/asiekierka/Statues/commits/master/?since=2014-07-09), including a **fixed crash** when opening Showcases, some refactors and Italian, Korean, Russian, and Simplified Chinese localizations
- Disabled the broken skin loader to **reduce log spam and improve performance**
- Made the missing parts of the **GUI translatable** and translated them into German

## Unfixed bugs from the original

These bugs occur in the original version, too:

- Showcase lids are never closing (asiekierka#15).
- Statues using player skins have been broken since around 2018.
- When shift-clicking the items into them, Statues accept any kind of armor type in all of its armor slots.
- NEI incorrectly shows a Statue and a second Showcase with just stone/wood textures.

## Development/Support/Maintenance

Apart from possibly fixing the bugs listed above as well as possible other bugs reported by players, I am not planning to further update this mod.

Of course, **you're free to open issues if you encounter bugs or incompatibilities/crashes and PRs are always welcome, including new/updated localization files!**
