SUMMARY = "KHOTKEYS"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    sonnet-native \
    kpackage-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    kglobalaccel \
    ki18n \
    kio \
    kxmlgui \
    kdelibs4support \
    kdbusaddons \
    kcmutils \
    plasma-framework \
    plasma-workspace \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "51806d36e83aa03aa6e201e58dafcf56"
SRC_URI[sha256sum] = "e7b866b5249ff7c5860a5a222dca79691ca1f09af176f786021fbbadbd718c8c"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
