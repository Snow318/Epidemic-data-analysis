function get_caizhen() {
    Zhejiang = {
        district: ['大连', '沈阳', '鞍山', '营口', '盘锦', '锦州', '抚顺', '丹东'],
        income: [1671.6, 1319.6, 515.2, 488.2, 269.9, 451.3, 366, 117.7, 136.1, 410, 116.2],
        outcome: [-1485.00, -1395.60, -771.6, -488, -342.7, -482.8, -489.1, -299.5, -265, -558.1, -371],
        
    },
    res_zhejaing = []
    for(var $i = 0; $i < Zhejiang.income.length; $i++) {
        res_zhejaing[$i] = (Zhejiang.income[$i] + Zhejiang.outcome[$i]).toFixed(1)   
    }
    Zhejiang.res = res_zhejaing
   
    Ningbo = {
        district: ['0到4点', '4到8点', '8到12点', '12到16点', '16到20点', '20到24点'],
        income: [1000, 2000, 3000, 4000, 7321, 12311],
        outcome: [-75, -53, -67, -221, -169, -55]
    }
    res_ningbo = []
    for(var $i = 0; $i < Ningbo.income.length; $i++) {
        res_ningbo[$i] = (Ningbo.income[$i] + Ningbo.outcome[$i]).toFixed(1)   
    }
    Ningbo.res = res_ningbo
    return [Zhejiang, Ningbo];
}
