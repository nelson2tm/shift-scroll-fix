# Shift-Scroll Fix for macOS
[Download available on CurseForge](https://www.curseforge.com/minecraft/mc-mods/shift-scroll-fix)

Shift-Scroll Fix is a very simple mod which fixes some annoying bugs related to scrolling while holding shift:
* **Minecraft 1.20.2 and newer**: fixes bug causing scroll direction to reverse while holding shift on macOS. ([MC-266429](https://bugs.mojang.com/browse/MC-266429))
* **Minecraft 1.20.1 and older**: fixes bug causing scrolling to be impossible while holding shift on macOS. ([MC-121772](https://bugs.mojang.com/browse/MC-121772))

### How does it work?
Holding shift on macOS while scrolling is supposed to make things scroll horizontally. Minecraft versions 1.13 to 1.20.1 simply ignore horizontal scrolling, and Minecraft version 1.20.2 and higher reverse scrolling direction while holding shift. This mod detects when you are scrolling horizontally and "converts" it to vertical scrolling, which lets you scroll normally through your hotbar again while (shift) sneaking for example.

### Installation
Just drag and drop the .jar file in the mods folder, launch the game and you should be able to scroll normally while holding shift. No dependencies or configuration needed.
