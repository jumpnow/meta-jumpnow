A meta-layer to collect common changes to upstream recipes and configs

Currently used in a build-farm for the following boards

* Beaglebones (BBB,BBBW, BBG, BBGW)
* Gumstix Duovero
* Raspberry Pi, all flavors, but most testing on RPi4, RPi3 and RPi0-W 
* Odroid-C2 
* Lenovo S10e netbook
* Wandboard
* Xilinx (zynq7 and zynqmp)


This layer depends on:

    URI: git://git.yoctoproject.org/poky.git
    branch: dunfell 

    URI: git://git.openembedded.org/meta-openembedded
    branch: dunfell 

    URI: git://git.yoctoproject.org/meta-security.git
    branch: dunfell 


meta-jumpnow layer maintainer: Scott Ellis <scott@jumpnowtek.com>
