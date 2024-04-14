import React, { useState } from "react";

const AddEmployee =()=>{

    const [employee, setEmployee] = useState({
        id:"",
        firstName:"",
        lastName:"",
        emailId:"", 
    });
    const handleChange=(e) =>{
        const value = e.target.value;
        setEmployee({...employee,[e.target.name]:value}); 
    };

    return <div className="flex max-w-2xl mx-auto shadow border-b">
        <div className="px-8 py-8">
            <div className="font-thin text-2xl tracking-wider"><h1>Add New Employee</h1></div>
            <div className="items-center justify-center h-14 w-full my-4">
                <label className="block text-gray-600 text-sm font-normal">First Name</label>
                <input type="text" onChange={(e) => handleChange(e)} name="firstName" value={employee.firstName} className="h-10 w-96 border mt-2 px-2 py-2"></input>
            </div>
            <div className="items-center justify-center h-14 w-full my-4">
                <label className="block text-gray-600 text-sm font-normal">Last Name</label>
                <input type="text" onChange={(e) => handleChange(e)} name="lastName" value={employee.lastName} className="h-10 w-96 border mt-2 px-2 py-2"></input>
            </div>
            <div className="items-center justify-center h-14 w-full my-4">
                <label className="block text-gray-600 text-sm font-normal">Email ID</label>
                <input type="text"   onChange={(e) => handleChange(e)} name="emailId" value={employee.emailId } className="h-10 w-96 border mt-2 px-2 py-2"></input>
            </div>
            <div className="items-center justify-center h-14 w-full my-4 space-x-4 pt-4">
                <button className="rounded text-white font-semibold bg-green-400 py-2 px-6 hover:bg-green-700">SAVE</button>
                <button className="rounded text-white font-semibold bg-red-400 py-2 px-6 hover:bg-red-700">CLEAR</button>
            </div>
        </div>
    </div>
};

export default AddEmployee;