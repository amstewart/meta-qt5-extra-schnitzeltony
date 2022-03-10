SUMMARY = "Provides access to all contacts"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    kconfig \
    kconfig-native \
    kservice \
    kwidgetsaddons \
    ki18n \
    kitemviews \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "77bf43f6714e2b82029b7a45d9a72779e28540375dd6d0e63f0fddf418c28226"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
