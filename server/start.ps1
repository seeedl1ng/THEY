$Java = "C:\Program Files\Eclipse Adoptium\jre-26.0.1.8-hotspot\bin\java.exe" # Replace it for yourself
$Args = @(
	'-XX:+UseZGC' 
	'-XX:+UseLargePages'	 # If you have enabled Large Pages Support / https://docs.oracle.com/en/java/javase/26/docs/specs/man/java.html#large-pages
	'-XX:+DisableExplicitGC'
	'-XX:+UseCompactObjectHeaders'
	'-XX:+PerfDisableSharedMem'
	# Java 26 arg
	'--enable-native-access=ALL-UNNAMED'
	'--add-opens=java.base/java.lang=ALL-UNNAMED'
	'--add-opens=java.base/sun.nio.ch=ALL-UNNAMED'

	'-Dlog4j.configurationFile=config/log4j2.xml'
	'-Xmx8G' 	# Replace
	'-Xms8G'	# Replace
	'-jar'
	'cleanroom-0.5.17-alpha.jar'	# Replace
	'nogui'
)
& $Java @Args

Pause
