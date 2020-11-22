SUMMARY = "Utility to test spidev in a loopback configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "cc1deb3c947ddc04966805b7ebff45ada4f2535c"
SRC_URI = "git://github.com/scottellis/spiloop.git"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    install -d ${D}${bindir}
    install -m 755 spiloop ${D}${bindir}
}

FILES_${PN} = "${bindir}"
