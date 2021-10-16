# Speedy Hopper

> Minecraft Fabric mod allowing hoppers to be faster... or slower, because why not! ¯\\\_(ツ)\_/¯


## Features

**Speedy Hopper** can actually be declined in two versions:

- **Fast Hopper**: 4 game ticks per transfer (twice as fast as a normal Hopper),
- **Slow Hopper**: 16 game ticks per transfer (twice as slow as a normal Hopper).

Note that this mod is deliberately designed so that Fast Hoppers are not overkill, and pretty expensive (especially in terms of time) to craft.  
This is to encourage the use of normal Hoppers, in order to keep the world close to vanilla.


## Craft

- **Fast Hopper**: a **Lingering Potion of Swiftness II** on top of a normal Hopper,  
  ![](https://media.forgecdn.net/attachments/373/571/fast_hopper_craft.png)
- **Slow Hopper**: a **Lingering Potion of Slowness IV** on top of a normal Hopper,  
  ![](https://media.forgecdn.net/attachments/373/572/slow_hopper_craft.png)
- Going back to a normal **Hopper**: a **Thick Lingering Potion** on top of a Speedy Hopper.  
![](https://media.forgecdn.net/attachments/373/573/hopper_craft_from_fast.png) ![](https://media.forgecdn.net/attachments/373/574/hopper_craft_from_slow.png)

Note that the bottle is consumed in all these crafts, as when making Tipped Arrows!


## Installation

This mod is for both clients and servers!  
As it adds new blocks, if you want to use it on a server, clients should have it too, so they can see and craft all the speedy hoppers.

All you need is, of course, the [Fabric launcher](https://fabricmc.net/use/), the [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api), and to copy the mod ".jar" file into your mods folder, with the API file.  
(For default Windows installations, after running the game with the Fabric launcher at least once, just copy / paste this into the path bar of any Explorer window to open the mod folder: `%appdata%\.minecraft\mods` — and press *Enter*.)

Speedy Hoppers are not customizable.


## Miscellaneous

The craft is not available in the recipe book (yet?).

This mod is translated in English and French.  
You are free to use this mod in any modpacks you'd make.

This mod works without conflict with my other mod "[Sticky Hopper](https://www.curseforge.com/minecraft/mc-mods/sticky-hopper)", but of course you won't be able to craft a "Fast Sticky Hopper", so you'll have to make choices and design your contraptions accordingly!

I don't plan to adapt it for another modloader than Fabric.  
Please take a look at the current [issues board](https://dev.cuicui.ovh/minecraft/speedy-hopper/-/boards), and also at [the interesting ideas and suggestions](https://dev.cuicui.ovh/minecraft/speedy-hopper/-/wikis/Ideas) I've received, to see what is likely to happen sooner or later!

*Hope you'll find this mod usefull! ♥ Also, feel free to take a look at [my other mods](https://www.curseforge.com/members/cuicui_off/projects)!*


### Versions

1.1 - (1.17) Bugfix: Pickaxe tag added, so it's possible to mine Speedy Hoppers  
1.0 Initial project with operational faster or slower Hoppers


### Known Incompatibilities

- _Vanilla Tweaks - Resource Packs_:
  I've found two [Vanilla Tweaks resource packs](https://vanillatweaks.net/picker/resource-packs/) that have small compatibility issues, due to the change in texture of the Speedy Hoppers.  
  => _Directional Hoppers_ normally displays an arrow inside the hopper if it is not pointing down. It does not appear in Speedy Hoppers because of the texture of the potions.  
  => _3D Items_, more annoying, changes the model used for items (in the hotbar, in the hand, and also for items dropped on the ground), and unfortunately the potions texture does not appear at all.   
  Here are screenshots to illustrate those issues (without resource packs, with _Directional Hoppers_, and with _3D Items_):  
  ![](https://media.forgecdn.net/attachments/401/581/resource_pack_no.png)
  ![](https://media.forgecdn.net/attachments/401/582/resource_pack_directional_hoppers.png)
  ![](https://media.forgecdn.net/attachments/401/583/resource_pack_3d_items.png)
