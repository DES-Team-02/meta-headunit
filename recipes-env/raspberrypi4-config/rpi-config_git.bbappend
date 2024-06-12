#ACTIVATE_I2C
ENABLE_I2C = "1"
 
# VC4 Graphics support
VC4GRAPHICS = "1"

# Waveshare "C" 1024x600 7" Rev2.1 IPS capacitive touch (http://www.waveshare.com/7inch-HDMI-LCD-C.htm)
WAVESHARE_1024X600_C_2_1 = "1"

# GPU memory
GPU_MEM_1024 = "1"

#Remove Splash
DISABLE_SPLASH = "1"

do_deploy:append() {
    echo "#Display rotates 90°" >> $CONFIG
    echo "video=DSI-1:800x480M@60,rotate=90" >> $CONFIG

    echo "#90°Right touch rotation" >> $CONFIG
    echo "Option "CalibrationMatrix" "0 1 0 -1 0 1 0 0 1"" >> $CONFIG

}
