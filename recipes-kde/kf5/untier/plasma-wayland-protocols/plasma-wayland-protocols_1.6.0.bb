SUMMARY = "Plasma-specific protocols for Wayland"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT & MIT-CMU"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
"

inherit kde-base

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BP}.tar.xz"
SRC_URI[sha256sum] = "b74ffac969ef067e47180e748a67a3a1816b7157ff4ea620ed4432f59b70f01f"

