SUMMARY = "Flutter Pi Systemd Service"
DESCRIPTION = "Systemd service to run Flutter Pi"
LICENSE = "CLOSED"

SRC_URI = "file://flutter-pi.service"

inherit systemd

SYSTEMD_SERVICE:${PN} = "flutter-pi.service"

do_install() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/flutter-pi.service ${D}${systemd_system_unitdir}/

    # Ensure the target directory for the symbolic link exists
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants

    # Enable the service
    ln -sf ${systemd_system_unitdir}/flutter-pi.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/flutter-pi.service
}
