### 第三方库

```
图片
compile 'com.squareup.picasso:picasso:2.5.2'
```

 
```
网络
compile 'com.squareup.okhttp3:okhttp:3.9.1'
```


```
事件总线
compile 'org.greenrobot:eventbus:3.0.0'
```

```
注解
compile 'com.jakewharton:butterknife:8.8.1'
annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
```


### 框架思路

##### MVP

* Views     作用：1：通知persenter获取数据，2：提供persenter更改界面的接口

```
0：Iview（所有view接口）
1. fragment
2. activity
3. adapter
```

* Presenter  作用：1：接受来之view的请求，2：通知service获取数据，3：提供service传递数据的接口，4：通知view更新数据
        
      
```
 0： Ipersenter
```
        
        
* Service 作用：1：接受来自persenter的请求，2：向网络请求数据，3：取消请求，4：通知persenter 更新数据


```
0：Iservice
```

        
* Model 作用：数据容器


```
0：eventBusbean
1：ottobean
2：defaultbean
```

### 事件传递思路
为了能减少依赖，所有的类似于：弹窗，数据传递，能封装的全部封装，通过eventBus 传递和调用


