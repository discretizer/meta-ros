DESCRIPTION = "mavros_msgs defines messages for MAVROS"
SECTION = "devel"
LICENCE = "BSD"
LICENCE = "GPLv3"
LICENSE = "LGPLv3"

LIC_FILES_CHKSUM = "file://../LICENSE-BSD.txt;md5=093726b05f1e17a73a6fbef81e1e94d1"
LIC_FILES_CHKSUM = "file://../LICENSE-GPLv3.txt;md5=d32239bcb673463ab874e80d47fae504"
LIC_FILES_CHKSUM = "file://../LICENSE-LGPLv3.txt;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS = "\
    std-msgs message-runtime \
    message-generation \
    geometry-msgs \
    rosconsole-bridge \
    mavlink \
"
RDEPENDS = "\
    mavlink \
"

ROS_SPN = "mavros_msgs"

require mavros.inc
