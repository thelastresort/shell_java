running dex excutable file on android shell. <br/>
by command : <br/>
ant <br/>
sh build_dex.sh <br/>
adb push hello.dex /sdcard/hello.dex <br/>
adb shell dalvikvm -cp /sdcard/hello.dex Hello <br/>

