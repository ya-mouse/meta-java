require jakarta-commons.inc

PR = "${INC_PR}.1"

SUMMARY = "JXPath interpreter for Java"

SRC_URI = "http://archive.apache.org/dist/commons/jxpath/source/${BP}-src.tar.gz"

PNBLACKLIST[commons-jxpath] ?= "BROKEN: indirectly depends on broken 'xom'"

DEPENDS += "commons-logging commons-collections3 commons-beanutils servlet2.3 jdom"
RDEPENDS:${PN} = "libcommons-logging-java libcommons-collections3-java libcommons-beanutils-java libservlet2.3-java libjdom-java"

CP = "commons-logging commons-collections3 commons-beanutils servlet-2.3 jdom"

SRC_URI[md5sum] = "9af6ed5d009061986d709a370829860e"
SRC_URI[sha256sum] = "da314198d75c6da660e2603bd1543a8f5d0b640c5144b748e62e59afc278efe6"
