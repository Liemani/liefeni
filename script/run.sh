#!/bin/bash

clean=false
args=()
for arg in "$@"; do
  case "$arg" in
    --clean)
      clean=true
      ;;
    *)
      args+=("$arg")
      ;;
  esac
done

if [ "${#args[@]}" -gt 2 ]; then
  echo 'usage: run.sh <user> <force run> [--clean]'
  echo '  force run: <any string>'
  echo '  --clean: delete generated build output before building'
  exit 1
fi

if $clean; then
  rm -rf build/classes build/hafen.jar bin/hafen.jar
fi

if $clean || [ "${#args[@]}" -le 1 ]; then
  if ! ant; then
    exit 1
  fi
fi

rsync -av /Volumes/mac/3_project/zz_liefeni/liefeni/bin/hafen.jar /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/hafen.jar
rsync -arv /Volumes/mac/3_project/zz_liefeni/liefeni/assets /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/assets
user="${args[0]-}"

/Library/Java/JavaVirtualMachines/temurin-25.jdk/Contents/Home/bin/java -Xmx1024m --add-exports=java.base/java.lang=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.desktop/sun.java2d=ALL-UNNAMED --enable-native-access=ALL-UNNAMED -Dhaven.errorurl=http://game.havenandhearth.com/java/error -Dhaven.hcrypt=on -Dhaven.dynresurl=https://game.havenandhearth.com/mt/dynres/ -Dhaven.server=game.havenandhearth.com -Dhaven.inittoken=45cadfda55cc752f9bc768a79e5bd7e012ca4c0a4c8b30d3c957b9f063e96df3 -Dhaven.cachebase=http://game.havenandhearth.com/render/ -Dhaven.fullscreen=off -Dhaven.resurl=https://game.havenandhearth.com/res/ -Dhaven.screenurl=http://game.havenandhearth.com/mt/ss -Dhaven.defserv=game.havenandhearth.com -Dhaven.mapbase=http://game.havenandhearth.com/java/ -Dsun.java2d.uiScale.enabled=false -Dhaven.srvmon=https://game.havenandhearth.com/mt/srv-mon -Dhaven.newsfeed=https://www.havenandhearth.com/forum/feed.php?mode=news -Djava.net.preferIPv6Addresses=system -Dhaven.authuser="$user" -classpath /Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/hafen.jar:/Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/hafen-res.jar:/Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/builtin-res.jar:/Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/jogl-all.jar:/Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/gluegen-rt.jar -Djava.library.path=/Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/.jogl-all-natives-macosx-universal.jar.lib:/Users/bagjeonghun/.cache/haven-launcher/cache/https/game.havenandhearth.com/java/jogl/2.6.0/jar/.gluegen-rt-natives-macosx-universal.jar.lib:/Users/bagjeonghun/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:. haven.MainFrame
