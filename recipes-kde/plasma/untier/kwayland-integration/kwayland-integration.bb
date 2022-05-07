SUMMARY = "Integration plugins for wayland windowing system"
DESCRIPTION = "Provides integration plugins for various KDE frameworks for the wayland windowing system"
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma

DEPENDS += " \
    qtwayland-native \
    kidletime \
    kwindowsystem \
    kguiaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "806a9607bb70f95b08ccad55f28eaf0a85adc1439afa2d2717b7c9d6c33022ec"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
