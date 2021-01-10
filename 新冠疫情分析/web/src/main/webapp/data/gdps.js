/**
 * gdp 亿元
 * gdp1 第一产业
 * gdp2 第二产业
 * gdp3 第三产业
 * rate %
 */

function get_gdps() {

    gdps = {
        Ningbo: {
            year: [2017, 2016, 2015, 2014, 2013],
            gdp: [9842.10, 8686.49, 8003.61, 7610.28, 7128.87]
        },
        LN: {
            year: [2020,2019,2018,2017, 2016, 2015, 2014, 2013,2012,2011],
            gdp: [26913,25315.35,23409.24,22246.90,28669.02,28626.58,27213.22,24846.43,22226.70,18457.27]
        },
    }
    
    
    // reverse data
    for (let city in gdps) {
        cityData = gdps[city]
        if (cityData.year[0] > cityData.year[1]) {
            for (let key in cityData) {
                cityData[key].reverse()
            }
        }
    }

    return gdps;
}


