SUMMARY = "Flutter Headunit Application"
DESCRIPTION = "Flutter Headunit Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Head-Unit"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Head-Unit/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "49023bdec66c0c9dc75d89f974501d75d88ad192"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Head-Unit.git;protocol=https;branch=dev"

S = "${WORKDIR}/git"

DEPENDS += " flutter-pi "

PUBSPEC_APPNAME = "flutter_head_unit"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"

inherit flutter-app

INSANE_SKIP:${PN} += "file-rdeps ldflags"
INSANE_SKIP:${PN}-dev += "file-rdeps dev-elf"



PACKAGES = "${PN} ${PN}-dev ${PN}-dbg ${PN}-src"
FILES:${PN} += "${libdir}/*.so"
FILES:${PN}-dev += "${includedir} ${libdir}/*.la ${libdir}/*.a"
FILES:${PN}-dbg += "${libdir}/debug"
FILES:${PN}-src += "${S}/*"
