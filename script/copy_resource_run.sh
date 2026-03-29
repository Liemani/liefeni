#!/bin/bash

ant

rsync -av /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/gluegen-rt-natives-macosx-universal.jar bin/
rsync -av /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/jogl-all-natives-macosx-universal.jar bin/
rsync -av /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/jogl-all.jar bin/
rsync -av /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/gluegen-rt.jar bin/

java -Dhaven.renderer=jogl \
  -cp "bin/hafen.jar:bin/hafen-res.jar:bin/builtin-res.jar:bin/jogl-all.jar:bin/gluegen-rt.jar:bin/jogl-all-natives-macosx-universal.jar:bin/gluegen-rt-natives-macosx-universal.jar" \
  --add-exports=java.base/java.lang=ALL-UNNAMED \
  --add-exports=java.desktop/sun.awt=ALL-UNNAMED \
  --add-exports=java.desktop/sun.java2d=ALL-UNNAMED \
  --enable-native-access=ALL-UNNAMED \
  -Dsun.java2d.uiScale.enabled=false \
  haven.MainFrame
