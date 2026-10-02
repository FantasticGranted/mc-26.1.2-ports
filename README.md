# Minecraft 26.1.2 mod ports

Four Minecraft mods ported to **Minecraft 26.1.2** (mojmap, Fabric, Java 25).

| Mod | Folder | Built artifact |
|---|---|---|
| MapMipMap Mod v1.3.1 | `mapmipmapmod/` | `mapmipmapmod/build/libs/mapmipmapmod-1.3.1.jar` |
| Chat Tabs v1.0.4 | `chat-tabs/` | `chat-tabs/versions/26.1.2/build/libs/chat-tabs-1.0.4-26.1.2.jar` |
| litematica-printer-hana (TGP V5) | `hana-printer/` | `hana-printer/versions/26.1.2/build/libs/litematica-printer-hana-26.1.2-TGP-V5-local.jar` |
| Nerv Printer Addon | `nerv-printer/` | `nerv-printer/build/libs/nerv-printer-26.1.2.jar` |

## Building

Requires JDK 25. In each folder:

```
gradlew build
```

## Toolchain

- Minecraft `26.1.2`, fabric-loader `0.19.5`, fabric-loom `1.17-SNAPSHOT`, Gradle 9.5.x
- fabric-api `0.155.3+26.1.2`, modmenu `18.0.1`
- meteor-client `26.1.2-SNAPSHOT` (nerv-printer)
- malilib `>=0.28.12`, litematica `>=0.27.14` (hana-printer)

## Port notes

- 26.x mappings are mojmap end-to-end (no yarn past 1.21.11); classes and members were
  remapped from yarn/intermediary 1.21.11 to 26.1.2 mojmap.
- All four mods declare `"minecraft": "~26.1.2"` and `"java": ">=25"` in `fabric.mod.json`.
