SUMMARY = "Flutter Headunit Application"
DESCRIPTION = "Flutter Headunit Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Head-Unit"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Head-Unit/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "03ff2018deedabfe77c52e866bd5cf5bcd6a7abf"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Head-Unit.git;protocol=https;branch=dev"

S = "${WORKDIR}/git"

DEPENDS += " flutter-pi "

do_install() {
    install -d ${D}${datadir}/flutter/flutter-app/Headunit/
    cp -r ${S}/bundle/* ${D}${datadir}/flutter/flutter-app/Headunit/
    install -d ${D}${libdir}/
    cp ${S}/bundle/lib/libHeadUnit-someip.so ${D}${libdir}/
}

FILES:${PN} += "\
    ${datadir}/flutter/flutter-app/Headunit/* \
    ${libdir}/libHeadUnit-someip.so \
"
FILES:${PN}-dev += "\
    ${libdir}/libHeadUnit-someip.so \
"

INSANE_SKIP:${PN} += "file-rdeps ldflags"
INSANE_SKIP:${PN}-dev += "file-rdeps dev-elf"