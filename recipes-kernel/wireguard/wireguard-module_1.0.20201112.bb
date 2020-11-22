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

SRC_URI = "https://git.zx2c4.com/wireguard-linux-compat/snapshot/wireguard-linux-compat-${PV}.tar.xz"

SRC_URI[sha256sum] = "89eae7f0c0bd6c8df3ba2e090984974ff68741a9f26aa0922890f8ca727897e1"

inherit module kernel-module-split

DEPENDS = "virtual/kernel libmnl"

EXTRA_OEMAKE_append = " \
    KERNELDIR=${STAGING_KERNEL_DIR} \
"

MAKE_TARGETS = "module"

RRECOMMENDS_${PN} = "kernel-module-xt-hashlimit"
MODULE_NAME = "wireguard"

S = "${WORKDIR}/wireguard-linux-compat-${PV}/src"

module_do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/${MODULE_NAME}
    install -m 0644 ${MODULE_NAME}.ko \
    ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/${MODULE_NAME}/${MODULE_NAME}.ko
}
