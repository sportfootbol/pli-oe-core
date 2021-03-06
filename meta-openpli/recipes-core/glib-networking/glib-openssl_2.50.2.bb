SUMMARY = "GLib networking for tls using openssl"
DESCRIPTION = "This is a fork of glib-networking providing only tls support using openssl. As a side point it fully supports Windows."
HOMEPAGE = "http://git.gnome.org/browse/glib-openssl/"
BUGTRACKER = "http://bugzilla.gnome.org"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5f30f0716dfdd0d91eb439ebec522ec2"

SECTION = "libs"
DEPENDS = "glib-2.0 intltool-native openssl"

SRC_URI[archive.md5sum] = "3331bc78aed330d993716fe636a939b6"
SRC_URI[archive.sha256sum] = "1a381fce3a932f66ff3d6acab40b6153f8fe4db7371834fae182aec7cc8b62ae"

inherit gnomebase gettext upstream-version-is-even gio-module-cache

FILES_${PN} += "${libdir}/gio/modules/libgio*.so ${datadir}/dbus-1/services/"
FILES_${PN}-dev += "${libdir}/gio/modules/libgio*.la"
FILES_${PN}-staticdev += "${libdir}/gio/modules/libgio*.a"
