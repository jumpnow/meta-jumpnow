SUMMARY = "chacha20-poly1305 crypto utilities"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit go godep

GO_IMPORT = "github.com/scottellis/${PN}"
SRC_URI = "git://${GO_IMPORT};rev=${PV}"

GO_LINKSHARED = ""

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

RDEPENDS_${PN}-staticdev += "bash"
RDEPENDS_${PN}-dev += "bash"
