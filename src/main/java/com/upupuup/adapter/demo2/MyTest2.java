package com.upupuup.adapter.demo2;

/**
 * @Author:upupupuup
 * @Date:2019/7/28 12:38 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class MyTest2 {
    public static void main(String[] args) {
        IProgrammer iProgrammer = new TencentProgrammer();
        ICooker iCooker = new BeijingCooker();
        // 将厨师和程序员放入数组里
        Object[] workers = {iProgrammer, iCooker};

        for (Object workerItem : workers) {
            IWorkAdapter iWorkAdapter = getAdapter(workerItem);
            iWorkAdapter.work(workerItem);
        }
    }

    private static IWorkAdapter getAdapter(Object worker) {
        IWorkAdapter cookerAdapter = new CookerAdapter();
        IWorkAdapter programmerAdapter = new ProgrammerAdapter();
        // 获取所有适配器
        IWorkAdapter[] iWorkAdapters = {cookerAdapter, programmerAdapter};
        // 遍历每一个适配器，判断哪个适配器支持当前工种
        for (IWorkAdapter iWorkAdapterItem : iWorkAdapters) {
            if (iWorkAdapterItem.support(worker)) {
                return iWorkAdapterItem;
            }
        }
        return null;
    }
}
