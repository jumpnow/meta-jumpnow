A meta-layer to collect common changes to upstream recipes and configs
that better suit my preferences.

Used with the following boards in my build farm

* Beaglebones (BBB,BBBW, BBG, BBGW)
* Gumstix Duovero
* Raspberry Pi, all flavors, but most testing on RPi4, RPi3 and RPi0-W 
* Odroid-C2 
* Lenovo S10e netbook
* Xilinx zynq7 and zynqmp
* Wandboard


This layer depends on:

    URI: git://git.yoctoproject.org/poky.git
    branch: zeus 

    URI: git://git.openembedded.org/meta-openembedded
    branch: zeus 

    URI: git://git.yoctoproject.org/meta-security.git
    branch: zeus 

Latest commits:

    poky 0275e68
    meta-openembedded aad5b3d
    meta-security 27ddb45 

meta-jumpnow layer maintainer: Scott Ellis <scott@jumpnowtek.com>
