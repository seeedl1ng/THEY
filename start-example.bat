chcp 65001
"C:\Program Files\Eclipse Adoptium\jre-26.0.1.8-hotspot\bin\java" -XX:+UseZGC --enable-native-access=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/sun.nio.ch=ALL-UNNAMED -Dfile.encoding=UTF-8 -Dconsole.encoding=UTF-8 -Dlog4j.configurationFile=config/log4j2.xml -Xmx5G -Xms5G -jar cleanroom-0.5.14-alpha.jar nogui 
pause
