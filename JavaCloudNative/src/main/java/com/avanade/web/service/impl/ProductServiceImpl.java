package com.avanade.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.avanade.web.entity.Product;
import com.avanade.web.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> retrieveProducts(int cid) {
		List<Product> productList = new ArrayList<>();
    	if(cid == 1) {
    		Product manProduct = new Product("男士气质时尚短款羽绒服","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E7%BE%BD%E7%BB%92%E6%9C%8D&step_word=&hs=0&pn=38&spn=0&di=7077213605308923905&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3818799930%2C340929284&os=2538721291%2C372166758&simid=3818799930%2C340929284&adpicid=0&lpn=0&ln=1922&fr=&fmq=1653191891388_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fqny.smzdm.com%2F202012%2F19%2F5fdde62a04cf05165.jpg%26refer%3Dhttp%3A%2F%2Fqny.smzdm.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Dauto%3Fsec%3D1655783902%26t%3De87a9e69ae726ef1526b2e35c356bebf&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf4z14_z%26e3Bv54AzdH3FrAzdH3Fdldnm9dnAzdH3F&gsm=26&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCwzLDIsNiw0LDEsNSw3LDgsOQ%3D%3D");
    		Product womenProduct = new Product("太平鸟男装冬新款中长款刺绣羽绒服","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E7%BE%BD%E7%BB%92%E6%9C%8D&step_word=&hs=0&pn=77&spn=0&di=7077213605308923905&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=611026801%2C2518924025&os=1483029521%2C3934535856&simid=611026801%2C2518924025&adpicid=0&lpn=0&ln=1922&fr=&fmq=1653191891388_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fimgservice.suning.cn%2Fuimg1%2Fb2c%2Fimage%2F34sqcofGQlh8kdFZR9bjrA.jpg%26refer%3Dhttp%3A%2F%2Fimgservice.suning.cn%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Dauto%3Fsec%3D1655784069%26t%3Df73b6fa9c974c007ebd02f17e1cc64ae&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf7gtg2_z%26e3Bv54AzdH3Ftpj4et1j5AzdH3Faa0ad9aa0lAzdH3Faaaaaaa8amcnbabdl9_z%26e3Bip4s&gsm=3c&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCwzLDIsNiw0LDEsNSw3LDgsOQ%3D%3D");
    		productList.add(manProduct);
    		productList.add(womenProduct);
    		
    	}else if(cid ==2){
    		Product manProduct = new Product("RUDSAK女士 MODAV领连帽束腰羽绒服","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%A5%B3%E5%A3%AB%E7%BE%BD%E7%BB%92%E6%9C%8D&step_word=&hs=0&pn=4&spn=0&di=7077213605308923905&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=4042791605%2C922040250&os=2585959051%2C1947713143&simid=4042791605%2C922040250&adpicid=0&lpn=0&ln=1595&fr=&fmq=1653192506424_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fimgservice.suning.cn%2Fuimg1%2Fb2c%2Fimage%2FzCSyL9DuJ_DOOuYiDPwQWg.jpg_800w_800h_4e%26refer%3Dhttp%3A%2F%2Fimgservice.suning.cn%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Dauto%3Fsec%3D1655784510%26t%3Dcd1016467528af7940eba990d3e98626&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf7gtg2_z%26e3Bv54AzdH3Ftpj4et1j5AzdH3FaaaaaaaaaaAzdH3F88mcdn9lm8a_z%26e3Bip4s&gsm=5&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCwzLDgsNCwxLDYsNSwyLDcsOQ%3D%3D");
    		Product womenProduct = new Product("女装冬季时尚大毛领韩版腰带","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%A5%B3%E5%A3%AB%E7%BE%BD%E7%BB%92%E6%9C%8D&step_word=&hs=0&pn=5&spn=0&di=7077213605308923905&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=642713591%2C3092375762&os=1589647108%2C2458741610&simid=3363765624%2C173318518&adpicid=0&lpn=0&ln=1595&fr=&fmq=1653192506424_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fimgservice.suning.cn%2Fuimg1%2Fb2c%2Fimage%2F7pwiDW_8CETpYmEDSImieA.jpg_800w_800h_4e%26refer%3Dhttp%3A%2F%2Fimgservice.suning.cn%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Dauto%3Fsec%3D1655784588%26t%3D1f44371272a505d815618306db9c790e&fromurl=ippr_z2C%24qAzdH3FAzdH3Fr6517vp_z%26e3Bf7gtg2_z%26e3Bv54AzdH3Faa0adlbl0mAzdH3Faaaaaaa88nm80amm9a_z%26e3Bip4s&gsm=6&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCwzLDgsNCwxLDYsNSwyLDcsOQ%3D%3D");
    		productList.add(manProduct);
    		productList.add(womenProduct);
    		
    	}else if(cid ==3) {
    		Product manProduct = new Product("男童羽绒服2019新款韩版","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%84%BF%E7%AB%A5%E7%BE%BD%E7%BB%92%E6%9C%8D&step_word=&hs=0&pn=31&spn=0&di=58720257&pi=0&rn=1&tn=baiduimagedetail&is=534922246%2C3951648915&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=3407665822%2C2355944908&os=534922246%2C3951648915&simid=3407665822%2C2355944908&adpicid=0&lpn=0&ln=1516&fr=&fmq=1653192649425_R&fm=result&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=14&oriquery=&objurl=https%3A%2F%2Fmobile.yangkeduo.com%2Fgoods.html%3Fgoods_id%3D185065526153&fromurl=ipprf_z2C%24qAzdH3FAzdH3F45ktsj_z%26e3Bywg2hj175_z%26e3Bv54AzdH3F2551f_z%26e3Bip4s%3F2551f_t1%3D8bcamccdm8cn&gsm=1d&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCwzLDgsNCwxLDYsNSwyLDcsOQ%3D%3D");
    		Product womenProduct = new Product("儿童羽绒服加厚款可拆裆背带裤婴幼儿羽绒服","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%84%BF%E7%AB%A5%E7%BE%BD%E7%BB%92%E6%9C%8D&step_word=&hs=0&pn=59&spn=0&di=58720257&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=4262162146%2C1403557327&os=486435330%2C3742253497&simid=4262162146%2C1403557327&adpicid=0&lpn=0&ln=1516&fr=&fmq=1653192649425_R&fm=result&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=14&oriquery=&objurl=https%3A%2F%2Fmobile.yangkeduo.com%2Fgoods.html%3Fgoods_id%3D39908626317&fromurl=ipprf_z2C%24qAzdH3FAzdH3F45ktsj_z%26e3Bywg2hj175_z%26e3Bv54AzdH3F2551f_z%26e3Bip4s%3F2551f_t1%3Dnllabmdmn80&gsm=38&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCwzLDgsNCwxLDYsNSwyLDcsOQ%3D%3D");
    		productList.add(manProduct);
    		productList.add(womenProduct);
    		
    	}
		
		return productList;
	}

}
