SUMMARY = "KDE document viewer"
LICENSE = "GPL-2.0 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    ki18n-native \
    kconfig-native \
    kauth-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    libkexiv2 \
    qca \
    tiff \
    kpty \
    poppler \
    kactivities \
    karchive \
    kbookmarks \
    kcompletion \
    kconfigwidgets \
    kdbusaddons \
    kiconthemes \
    kirigami2 \
    purpose \
    kjs \
    kio \
    ki18n \
    kparts \
    threadweaver \
    kwallet \
    khtml \
    kwindowsystem \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "fa1fc1a4a4d84c1e568665d4c05cd00f71c5ba481dad7b6b8d83597a428b5056"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/config.kcfg \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org \
"
