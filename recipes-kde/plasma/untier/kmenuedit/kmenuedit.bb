SUMMARY = "KMENUEDIT"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n \
    kxmlgui \
    kdbusaddons \
    kiconthemes \
    kio \
    sonnet \
    sonnet-native \
    kdelibs4support \
    kdelibs4support-native \
    kdesignerplugin-native \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "9365c0ad08e0f184c43c75d06e68d69a"
SRC_URI[sha256sum] = "7b46c301767159cf53b29c9718441c10d1285f3ba39cf606c4a6bd9f74d8fcf9"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_kmenuedit.so \
"
