SUMMARY = "Basic image for Team2 HeadUnit project"

inherit core-image

IMAGE_FSTYPES = "rpi-sdimg"

CORE_IMAGE_BASE_INSTALL = "\
	packagegroup-core-boot \
	packagegroup-base-extended \
    packagegroup-core-x11 \
	${CORE_IMAGE_EXTRA_INSTALL} \
"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

LINGUAS_KO_KR = "ko-kr"
LINGUAS_EN_US = "en-us"
IMAGE_LIGUAS = "${LINGUAS_KO_KR} ${LINGUAS_EN_US}"
IMAGE_OVERHEAD_FACTOR = "1.3"

