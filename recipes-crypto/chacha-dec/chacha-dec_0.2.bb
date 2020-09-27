SUMMARY = "chacha20poly1305 decrypt utility"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "go-dep-native"

inherit go

GO_IMPORT = "github.com/scottellis/chacha-dec"
SRC_URI = "git://${GO_IMPORT};rev=${PV}"

GO_INSTALL = "${GO_IMPORT}/."

GO_LINKSHARED = ""

do_compile_prepend() {
    rm -f ${WORKDIR}/build/src/${GO_IMPORT}/Gopkg.toml
    rm -f ${WORKDIR}/build/src/${GO_IMPORT}/Gopkg.lock
    cd ${WORKDIR}/build/src/${GO_IMPORT}
    dep init
    dep ensure
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

RDEPENDS_${PN}-staticdev += "bash"
RDEPENDS_${PN}-dev += "bash"
