running dex excutable file on android shell. 
by command : 
ant
sh build_dex.sh
adb push hello.dex /sdcard/hello.dex
adb shell dalvikvm -cp /sdcard/hello.dex Hello 

