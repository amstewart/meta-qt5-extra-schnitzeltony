SUMMARY = "OXYGEN"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
    kauth-native \
    kconfig \
    kconfig-native \
    kcoreaddons-native \
    kguiaddons \
    kwidgetsaddons \
    kservice \
    kcompletion \
    frameworkintegration \
    kwindowsystem \
    kdecoration \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras", "", d)} \
"


PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "a51ec2a3f51a27885f707aa087a7165a2aef3ac284353eafeaaeccef6211e4ba"

PACKAGECONFIG ??= ""
PACKAGECONFIG[settings] = "-DBUILD_OXYGEN_SETTINGS=ON,-DBUILD_OXYGEN_SETTINGS=OFF,kcmutils"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kservices5 \
    ${datadir}/kstyle \
    ${datadir}/plasma \
    ${datadir}/color-schemes \
    ${OE_QMAKE_PATH_PLUGINS} \
"
