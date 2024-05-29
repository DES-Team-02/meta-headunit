ENV_SETTING = " \
	wpa-supplicant \
	libsocketcan \
	openssh \
	bcm2835-dev \
	udev-rules-rpi \
	udev-extraconf \
	supervisor \
	xdotool \
"

META_OE = " \
	libgpiod \ 
	mpv \
"

FLUTTER_APP = " \
	headunit \
	headunit-dev \
	touchscreen-init \
	window-init \
	flutter-pi \
	flutter-engine \
"
	

VSOMEIP = " \
	common-api-c++ \
	common-api-c++-dev \
	vsomeip \
	vsomeip-dev \
	common-api-c++-someip \
	common-api-c++-someip-dev \
"


PYTHON_SETTING = " \
	python3 \
	python3-core \
	python3-supervisor \
	python3-numpy \
	python3-pip \
	opencv \
	rpi-gpio \
"

IMAGE_INSTALL += " \
	${ENV_SETTING} \
	${META_OE} \
	${VSOMEIP} \
	${PYTHON_SETTING} \
	${FLUTTER_APP} \
"
	