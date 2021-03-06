require u-boot-socfpga-common.inc
require ${COREBASE}/meta/recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS =. "${THISDIR}/files/v2017.09:"

SRCREV = "c98ac3487e413c71e5d36322ef3324b21c6f60f9"

# Stratix10 is not mainlined yet
SRCREV_stratix10 = "8807902b23aea7dc6f25d1818fc68f10220afcb4"
SRC_URI_stratix10 = "git://github.com/altera-opensource/u-boot-socfpga.git;branch=socfpga_v2017.09;prot=https"

SRC_URI_append = "\
	"

DEPENDS += "dtc-native bc-native u-boot-mkimage-native"
