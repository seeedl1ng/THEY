$Java = "C:\Program Files\Eclipse Adoptium\jre-26.0.1.8-hotspot\bin\java.exe"
& $Java `
	'-XX:+UseZGC' `
	'-XX:+UseLargePages' `
	'-XX:+DisableExplicitGC' `
	'-XX:+UseCompactObjectHeaders' `
	'-XX:+PerfDisableSharedMem' `
	'--enable-native-access=ALL-UNNAMED' `
	'--add-opens=java.base/java.lang=ALL-UNNAMED' `
	'--add-opens=java.base/sun.nio.ch=ALL-UNNAMED' `
	'-Dlog4j.configurationFile=config/log4j2.xml' `
	'-Xmx8G' `
	'-Xms8G' `
	'-jar' `
	'cleanroom-0.5.17-alpha.jar' `
	'nogui'
Pause
