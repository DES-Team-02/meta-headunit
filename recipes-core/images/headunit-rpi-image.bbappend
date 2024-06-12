ENV_SETTING = " \
	wpa-supplicant \
	openssh \
	bcm2835-dev \
"

META_OE = " \
	libgpiod \ 
	mpv \
"

FLUTTER_APP = " \
	headunit \
	headunit-dev \
	headunitffi \
	flutter-pi \
	flutter-pi-service \
	libegl-mesa-dev \
	libgles3-mesa-dev \
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
	