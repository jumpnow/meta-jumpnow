SUMMARY = "WireGuard is an extremely simple yet fast and modern VPN"
DESCRIPTION="WireGuard is a secure network tunnel, operating at layer 3, \
implemented as a kernel virtual network interface for Linux, which aims to \
replace both IPsec for most use cases, as well as popular user space and/or \
TLS-based solutions like OpenVPN, while being more secure, more performant, \
and easier to use."
SECTION = "networking"
HOMEPAGE = "https://www.wireguard.io/"
LICENSE = "GPL-2.0"

LIC_FILES_CHKSUM = "file://../COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://git.zx2c4.com/wireguard-tools/snapshot/wireguard-tools-${PV}.tar.xz"

SRC_URI[sha256sum] = "51bc85e33a5b3cf353786ae64b0f1216d7a871447f058b6137f793eb0f53b7fd"

inherit bash-completion systemd pkgconfig

DEPENDS = "libmnl"

S = "${WORKDIR}/wireguard-tools-${PV}/src/"

do_install () {
    oe_runmake DESTDIR="${D}" PREFIX="${prefix}" SYSCONFDIR="${sysconfdir}" \
        SYSTEMDUNITDIR="${systemd_unitdir}" \
        WITH_SYSTEMDUNITS=${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'yes', '', d)} \
        WITH_BASHCOMPLETION=yes \
        WITH_WGQUICK=yes \
        install
}

FILES_${PN} = " \
    ${sysconfdir} \
    ${systemd_unitdir} \
    ${bindir} \
"

RDEPENDS_${PN} = " \
    bash \
    ${@bb.utils.contains('WIREGUARD_COMPAT', '1', 'wireguard-module', '', d)} \
"
