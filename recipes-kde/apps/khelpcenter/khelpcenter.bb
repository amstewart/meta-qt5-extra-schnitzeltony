SUMMARY = "Application to show KDE Applications' documentation"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
"

inherit kde-apps gettext

DEPENDS += " \
    grantlee \
    xapian-core \
    \
    kauth-native \
    karchive \
    kbookmarks \
    kconfig-native \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    ki18n \
    kinit \
    khtml \
    kservice \
    kwindowsystem \
    sonnet-native \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "4fd1e0eaf4ed69bd3583025cd6c5e7fc487b1bd5634cd938609fe0ef8794f88e"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/kde4 \
    ${libdir}/libkdeinit5_khelpcenter.so \
"

RDEPENDS_${PN} += "perl"
