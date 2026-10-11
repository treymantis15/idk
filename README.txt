1. Go to https://fabricmc.net/develop/template
   - Mod name: Elytra Name
   - Mod ID:   elytraname
   - Package:  com.example
   - Minecraft version: 1.21.11
   - Mappings: Mojang
   - UNTICK "Split client and common sources"
   Download and unzip it.
2. Copy the "src" folder from this zip into the unzipped project, choosing
   "merge/replace" when asked.
3. Open a terminal in the project folder and run:  ./gradlew build
4. Your mod is in build/libs/ (the file WITHOUT "-sources" in its name).
5. Prism Launcher -> your 1.21.11 Fabric instance -> Edit -> Mods -> Add file.
