SUMMARY = "Plasma applet for audio volume management using PulseAudio"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma gettext

DEPENDS += " \
    glib-2.0 \
    pulseaudio \
    libcanberra \
    \
    kcoreaddons \
    kcoreaddons-native \
    kconfig-native \
    kpackage-native \
    kdeclarative \
    kdoctools \
    kdoctools-native \
    kglobalaccel \
    ki18n \
    plasma-framework \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "6d6f3ba2303c6f640fa2c8c3c648e10021651a00f5ab10d5d78dc7e3ed9d4741"

FILES_SOLIBSDEV = ""

RDEPENDS_${PN} += "pulseaudio-server perl"

FILES_${PN} += " \
    ${datadir}/kpackage \
    ${datadir}/kconf_update \
    ${datadir}/kde4 \
    ${datadir}/plasma \
    ${datadir}/kservices5 \
    ${libdir}/lib*Private.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"
