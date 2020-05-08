SUMMARY = "Utility to update entropy count after adding to urandom"
DESCRIPTION = "Writing to /dev/urandom does not increment entropy count"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e048e7a053ab211791bc99c98e723ab7"

SRCREV = "3cef9b224336ac4147aade20738420193e525fc5"
SRC_URI = "git://github.com/jumpnow/rndaddtoentcnt.git"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    install -d ${D}${bindir}
    install -m 755 rndaddtoentcnt ${D}${bindir}
}

FILES_${PN} = "${bindir}"
