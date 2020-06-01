package com.mini.controller;



import com.mini.error.BusinessException;
import com.mini.error.EmBusinessError;
import com.mini.response.CommontReturnType;
import com.mini.utils.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * 消息推送
 *
 * @author :ZHANGPENGFEI
 **/
@Controller
@RequestMapping("/websocket")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = {"Access-Control-Allow-Origin: *"})
public class WebSocketController {

    @Autowired
    HttpServletRequest httpServletRequest;
    /**
     * 推送数据接口
     *
     * @param cid     发送消息的用户ID
     * @param message 发送的消息
     * @return 返回发送消息的用户ID
     */
    @ResponseBody
    @RequestMapping(value = "/push", method = RequestMethod.POST)
    public String pushToWeb(@RequestParam("cid") String cid, @RequestParam("message") String message) {
        try {
            WebSocketServer.sendInfo(message, cid, null);
        } catch (IOException e) {
            e.printStackTrace();
            return cid + "#" + e.getMessage();
        }
        return cid;
    }

/*    @ResponseBody
    @RequestMapping(value = "/socket/sendMsg", method = RequestMethod.POST)
    public void sendMessages(@RequestParam("userId") Integer userId) throws BusinessException {
        if (userId == 0) {
            throw new BusinessException(EmBusinessError.USER_NOT_LOGIN);
        }
        List<Integer> idList = followService.selectUserId(userId);
        if (idList == null) {
            return;
        }
        for (Integer integer : idList) {
            try {
                WebSocketServer.sendInfo("@newMessage@", String.valueOf(userId), String.valueOf(integer));
            } catch (IOException e) {
                throw new BusinessException(EmBusinessError.UNKNOWN_ERROR);
            }
        }
    }*/


/**
     *
     * @param loginUserId 当前用户id
     * @param recUserId 接收消息id
     * @param conImg    发送的图片内容，小程序不支持这种方式
     * @throws BusinessException
     */


    @ResponseBody
    @RequestMapping(value = "/p2p", method = RequestMethod.POST)
    public boolean p2P(@RequestParam Integer loginUserId,
                    @RequestParam(name = "recUserId") Integer recUserId,
                    @RequestParam(name = "content") String message,
                    MultipartFile conImg
    ) throws BusinessException {
        try {
            //设置发送成功标志，返回给前端,用于发送失败时提示用户
            return WebSocketServer.sendInfo(message, String.valueOf(loginUserId), String.valueOf(recUserId));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
/*    @ResponseBody
    @RequestMapping(value = "/socket/getUnreadMessage", method = RequestMethod.POST)
    public CommontReturnType getUnreadMessage(@RequestParam("loginUserId") Integer loginUserId
    ) throws BusinessException {
        if (loginUserId == 0) {
            throw new BusinessException(EmBusinessError.USER_NOT_LOGIN);
        }
        List<UnreadMessageBean> beans = recordsService.getUnreadMessage(loginUserId);
        if (beans == null){
            return CommontReturnType.create(null);
        }
        return CommontReturnType.create(beans);
    }
    @ResponseBody
    @RequestMapping(value = "/socket/getRecords", method = RequestMethod.POST)
    public CommontReturnType getRecords(@RequestParam("loginUserId") Integer loginUserId,
                                        @RequestParam(name = "recUserId") Integer recUserId
    ) throws BusinessException {
        if (loginUserId == 0) {
            throw new BusinessException(EmBusinessError.USER_NOT_LOGIN);
        }
        ChattingRecordsBean bean = recordsService.getChattingRecords(loginUserId,recUserId);
        if (bean == null){
            return CommontReturnType.create(null);
        }
        return CommontReturnType.create(bean);
    }*/
}

